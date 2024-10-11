package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.ParentFill: ImageVector
    get() {
        if (_parentFill != null) {
            return _parentFill!!
        }
        _parentFill = Builder(name = "ParentFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                curveTo(4.515f, 11.0f, 2.5f, 8.985f, 2.5f, 6.5f)
                curveTo(2.5f, 4.015f, 4.515f, 2.0f, 7.0f, 2.0f)
                curveTo(9.485f, 2.0f, 11.5f, 4.015f, 11.5f, 6.5f)
                curveTo(11.5f, 8.985f, 9.485f, 11.0f, 7.0f, 11.0f)
                close()
                moveTo(17.5f, 15.0f)
                curveTo(15.291f, 15.0f, 13.5f, 13.209f, 13.5f, 11.0f)
                curveTo(13.5f, 8.791f, 15.291f, 7.0f, 17.5f, 7.0f)
                curveTo(19.709f, 7.0f, 21.5f, 8.791f, 21.5f, 11.0f)
                curveTo(21.5f, 13.209f, 19.709f, 15.0f, 17.5f, 15.0f)
                close()
                moveTo(17.5f, 16.0f)
                curveTo(19.985f, 16.0f, 22.0f, 18.015f, 22.0f, 20.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.5f)
                curveTo(13.0f, 18.015f, 15.015f, 16.0f, 17.5f, 16.0f)
                close()
                moveTo(7.0f, 12.0f)
                curveTo(9.761f, 12.0f, 12.0f, 14.239f, 12.0f, 17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 14.239f, 4.239f, 12.0f, 7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _parentFill!!
    }

private var _parentFill: ImageVector? = null
