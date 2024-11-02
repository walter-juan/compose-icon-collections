package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ComputerDesktop: ImageVector
    get() {
        if (_computerDesktop != null) {
            return _computerDesktop!!
        }
        _computerDesktop = Builder(name = "ComputerDesktop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 5.25f)
                curveTo(2.25f, 3.593f, 3.593f, 2.25f, 5.25f, 2.25f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 2.25f, 21.75f, 3.593f, 21.75f, 5.25f)
                verticalLineTo(15.0f)
                curveTo(21.75f, 16.657f, 20.407f, 18.0f, 18.75f, 18.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(18.257f)
                curveTo(15.75f, 18.854f, 15.987f, 19.426f, 16.409f, 19.848f)
                lineTo(17.03f, 20.47f)
                curveTo(17.245f, 20.684f, 17.309f, 21.007f, 17.193f, 21.287f)
                curveTo(17.077f, 21.567f, 16.803f, 21.75f, 16.5f, 21.75f)
                horizontalLineTo(7.5f)
                curveTo(7.197f, 21.75f, 6.923f, 21.567f, 6.807f, 21.287f)
                curveTo(6.691f, 21.007f, 6.755f, 20.684f, 6.97f, 20.47f)
                lineTo(7.591f, 19.848f)
                curveTo(8.013f, 19.426f, 8.25f, 18.854f, 8.25f, 18.257f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 18.0f, 2.25f, 16.657f, 2.25f, 15.0f)
                verticalLineTo(5.25f)
                close()
                moveTo(3.75f, 5.25f)
                verticalLineTo(12.75f)
                curveTo(3.75f, 13.578f, 4.422f, 14.25f, 5.25f, 14.25f)
                horizontalLineTo(18.75f)
                curveTo(19.578f, 14.25f, 20.25f, 13.578f, 20.25f, 12.75f)
                verticalLineTo(5.25f)
                curveTo(20.25f, 4.422f, 19.578f, 3.75f, 18.75f, 3.75f)
                horizontalLineTo(5.25f)
                curveTo(4.422f, 3.75f, 3.75f, 4.422f, 3.75f, 5.25f)
                close()
            }
        }
        .build()
        return _computerDesktop!!
    }

private var _computerDesktop: ImageVector? = null
