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

public val OthersGroup.ArmchairFill: ImageVector
    get() {
        if (_armchairFill != null) {
            return _armchairFill!!
        }
        _armchairFill = Builder(name = "ArmchairFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(5.791f, 3.0f, 4.0f, 4.791f, 4.0f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(6.761f, 8.0f, 9.0f, 10.239f, 9.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 10.239f, 17.239f, 8.0f, 20.0f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.791f, 18.209f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(20.0f, 10.0f)
                curveTo(18.343f, 10.0f, 17.0f, 11.343f, 17.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 11.343f, 5.657f, 10.0f, 4.0f, 10.0f)
                curveTo(2.343f, 10.0f, 1.0f, 11.343f, 1.0f, 13.0f)
                curveTo(1.0f, 14.306f, 1.835f, 15.417f, 3.0f, 15.829f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.829f)
                curveTo(22.165f, 15.417f, 23.0f, 14.306f, 23.0f, 13.0f)
                curveTo(23.0f, 11.343f, 21.657f, 10.0f, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _armchairFill!!
    }

private var _armchairFill: ImageVector? = null
