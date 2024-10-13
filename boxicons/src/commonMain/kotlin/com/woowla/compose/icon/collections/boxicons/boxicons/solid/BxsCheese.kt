package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCheese: ImageVector
    get() {
        if (_bxsCheese != null) {
            return _bxsCheese!!
        }
        _bxsCheese = Builder(name = "BxsCheese", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.16f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.66f, 0.13f)
                lineToRelative(-12.0f, 7.0f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.13f, 0.1f)
                lineToRelative(-0.1f, 0.08f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -0.17f, 0.26f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.1f, 0.43f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.0f, 10.0f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -6.84f, -8.0f)
                close()
                moveTo(15.16f, 4.05f)
                arcTo(6.07f, 6.07f, 0.0f, false, true, 19.93f, 9.0f)
                lineTo(6.7f, 9.0f)
                close()
                moveTo(6.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 18.0f)
                close()
                moveTo(11.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsCheese!!
    }

private var _bxsCheese: ImageVector? = null
