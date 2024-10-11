package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.LinkedinBoxFill: ImageVector
    get() {
        if (_linkedinBoxFill != null) {
            return _linkedinBoxFill!!
        }
        _linkedinBoxFill = Builder(name = "LinkedinBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.336f, 18.339f)
                horizontalLineTo(15.671f)
                verticalLineTo(14.162f)
                curveTo(15.671f, 13.166f, 15.651f, 11.884f, 14.282f, 11.884f)
                curveTo(12.892f, 11.884f, 12.68f, 12.968f, 12.68f, 14.089f)
                verticalLineTo(18.339f)
                horizontalLineTo(10.014f)
                verticalLineTo(9.75f)
                horizontalLineTo(12.575f)
                verticalLineTo(10.921f)
                horizontalLineTo(12.609f)
                curveTo(12.967f, 10.246f, 13.837f, 9.533f, 15.137f, 9.533f)
                curveTo(17.837f, 9.533f, 18.337f, 11.311f, 18.337f, 13.625f)
                verticalLineTo(18.339f)
                horizontalLineTo(18.336f)
                close()
                moveTo(7.004f, 8.575f)
                curveTo(6.146f, 8.575f, 5.456f, 7.88f, 5.456f, 7.026f)
                curveTo(5.456f, 6.173f, 6.146f, 5.479f, 7.004f, 5.479f)
                curveTo(7.859f, 5.479f, 8.552f, 6.173f, 8.552f, 7.026f)
                curveTo(8.552f, 7.88f, 7.858f, 8.575f, 7.004f, 8.575f)
                close()
                moveTo(8.34f, 18.339f)
                horizontalLineTo(5.667f)
                verticalLineTo(9.75f)
                horizontalLineTo(8.34f)
                verticalLineTo(18.339f)
                close()
                moveTo(19.67f, 3.0f)
                horizontalLineTo(4.329f)
                curveTo(3.595f, 3.0f, 3.001f, 3.58f, 3.001f, 4.297f)
                verticalLineTo(19.703f)
                curveTo(3.001f, 20.42f, 3.595f, 21.0f, 4.329f, 21.0f)
                horizontalLineTo(19.667f)
                curveTo(20.401f, 21.0f, 21.001f, 20.42f, 21.001f, 19.703f)
                verticalLineTo(4.297f)
                curveTo(21.001f, 3.58f, 20.401f, 3.0f, 19.667f, 3.0f)
                horizontalLineTo(19.67f)
                close()
            }
        }
        .build()
        return _linkedinBoxFill!!
    }

private var _linkedinBoxFill: ImageVector? = null
