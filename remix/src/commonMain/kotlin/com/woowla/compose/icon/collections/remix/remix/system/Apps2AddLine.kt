package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.Apps2AddLine: ImageVector
    get() {
        if (_apps2AddLine != null) {
            return _apps2AddLine!!
        }
        _apps2AddLine = Builder(name = "Apps2AddLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 7.0f)
                curveTo(2.5f, 9.485f, 4.515f, 11.5f, 7.0f, 11.5f)
                curveTo(9.485f, 11.5f, 11.5f, 9.485f, 11.5f, 7.0f)
                curveTo(11.5f, 4.515f, 9.485f, 2.5f, 7.0f, 2.5f)
                curveTo(4.515f, 2.5f, 2.5f, 4.515f, 2.5f, 7.0f)
                close()
                moveTo(2.5f, 17.0f)
                curveTo(2.5f, 19.485f, 4.515f, 21.5f, 7.0f, 21.5f)
                curveTo(9.485f, 21.5f, 11.5f, 19.485f, 11.5f, 17.0f)
                curveTo(11.5f, 14.515f, 9.485f, 12.5f, 7.0f, 12.5f)
                curveTo(4.515f, 12.5f, 2.5f, 14.515f, 2.5f, 17.0f)
                close()
                moveTo(12.5f, 17.0f)
                curveTo(12.5f, 19.485f, 14.515f, 21.5f, 17.0f, 21.5f)
                curveTo(19.485f, 21.5f, 21.5f, 19.485f, 21.5f, 17.0f)
                curveTo(21.5f, 14.515f, 19.485f, 12.5f, 17.0f, 12.5f)
                curveTo(14.515f, 12.5f, 12.5f, 14.515f, 12.5f, 17.0f)
                close()
                moveTo(9.5f, 7.0f)
                curveTo(9.5f, 8.381f, 8.381f, 9.5f, 7.0f, 9.5f)
                curveTo(5.619f, 9.5f, 4.5f, 8.381f, 4.5f, 7.0f)
                curveTo(4.5f, 5.619f, 5.619f, 4.5f, 7.0f, 4.5f)
                curveTo(8.381f, 4.5f, 9.5f, 5.619f, 9.5f, 7.0f)
                close()
                moveTo(9.5f, 17.0f)
                curveTo(9.5f, 18.381f, 8.381f, 19.5f, 7.0f, 19.5f)
                curveTo(5.619f, 19.5f, 4.5f, 18.381f, 4.5f, 17.0f)
                curveTo(4.5f, 15.619f, 5.619f, 14.5f, 7.0f, 14.5f)
                curveTo(8.381f, 14.5f, 9.5f, 15.619f, 9.5f, 17.0f)
                close()
                moveTo(19.5f, 17.0f)
                curveTo(19.5f, 18.381f, 18.381f, 19.5f, 17.0f, 19.5f)
                curveTo(15.619f, 19.5f, 14.5f, 18.381f, 14.5f, 17.0f)
                curveTo(14.5f, 15.619f, 15.619f, 14.5f, 17.0f, 14.5f)
                curveTo(18.381f, 14.5f, 19.5f, 15.619f, 19.5f, 17.0f)
                close()
                moveTo(16.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _apps2AddLine!!
    }

private var _apps2AddLine: ImageVector? = null
