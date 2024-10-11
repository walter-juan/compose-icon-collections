package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.ArmchairLine: ImageVector
    get() {
        if (_armchairLine != null) {
            return _armchairLine!!
        }
        _armchairLine = Builder(name = "ArmchairLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(5.791f, 3.0f, 4.0f, 4.791f, 4.0f, 7.0f)
                verticalLineTo(9.126f)
                curveTo(2.275f, 9.57f, 1.0f, 11.136f, 1.0f, 13.0f)
                curveTo(1.0f, 14.482f, 1.805f, 15.773f, 3.0f, 16.465f)
                verticalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                verticalLineTo(16.465f)
                curveTo(22.195f, 15.773f, 23.0f, 14.482f, 23.0f, 13.0f)
                curveTo(23.0f, 11.136f, 21.725f, 9.57f, 20.0f, 9.126f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.791f, 18.209f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(18.0f, 9.126f)
                curveTo(16.275f, 9.57f, 15.0f, 11.136f, 15.0f, 13.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 11.136f, 7.725f, 9.57f, 6.0f, 9.126f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 5.895f, 6.895f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 5.0f, 18.0f, 5.895f, 18.0f, 7.0f)
                verticalLineTo(9.126f)
                close()
                moveTo(9.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 11.895f, 17.895f, 11.0f, 19.0f, 11.0f)
                curveTo(20.105f, 11.0f, 21.0f, 11.895f, 21.0f, 13.0f)
                curveTo(21.0f, 13.869f, 20.445f, 14.611f, 19.667f, 14.887f)
                curveTo(19.267f, 15.028f, 19.0f, 15.406f, 19.0f, 15.829f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.829f)
                curveTo(5.0f, 15.406f, 4.733f, 15.028f, 4.333f, 14.887f)
                curveTo(3.555f, 14.611f, 3.0f, 13.869f, 3.0f, 13.0f)
                curveTo(3.0f, 11.895f, 3.895f, 11.0f, 5.0f, 11.0f)
                curveTo(6.105f, 11.0f, 7.0f, 11.895f, 7.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _armchairLine!!
    }

private var _armchairLine: ImageVector? = null
