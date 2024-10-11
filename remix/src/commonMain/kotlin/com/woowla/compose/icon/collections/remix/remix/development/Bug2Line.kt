package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.Bug2Line: ImageVector
    get() {
        if (_bug2Line != null) {
            return _bug2Line!!
        }
        _bug2Line = Builder(name = "Bug2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.562f, 4.148f)
                curveTo(11.026f, 4.051f, 11.507f, 4.0f, 12.0f, 4.0f)
                curveTo(12.493f, 4.0f, 12.974f, 4.051f, 13.438f, 4.148f)
                lineTo(15.121f, 2.464f)
                lineTo(16.535f, 3.879f)
                lineTo(15.486f, 4.928f)
                curveTo(16.718f, 5.637f, 17.713f, 6.71f, 18.326f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.929f)
                curveTo(18.976f, 10.327f, 19.0f, 10.66f, 19.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 15.34f, 18.976f, 15.673f, 18.929f, 16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.326f)
                curveTo(17.203f, 20.365f, 14.792f, 22.0f, 12.0f, 22.0f)
                curveTo(9.208f, 22.0f, 6.797f, 20.365f, 5.674f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.071f)
                curveTo(5.024f, 15.673f, 5.0f, 15.34f, 5.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 10.66f, 5.024f, 10.327f, 5.071f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.674f)
                curveTo(6.286f, 6.71f, 7.282f, 5.637f, 8.514f, 4.928f)
                lineTo(7.464f, 3.879f)
                lineTo(8.879f, 2.464f)
                lineTo(10.562f, 4.148f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(9.239f, 6.0f, 7.0f, 8.239f, 7.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(7.0f, 17.761f, 9.239f, 20.0f, 12.0f, 20.0f)
                curveTo(14.761f, 20.0f, 17.0f, 17.761f, 17.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 8.239f, 14.761f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _bug2Line!!
    }

private var _bug2Line: ImageVector? = null
