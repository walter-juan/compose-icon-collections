package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxPackage: ImageVector
    get() {
        if (_bxPackage != null) {
            return _bxPackage!!
        }
        _bxPackage = Builder(name = "BxPackage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, 0.0f, -0.21f)
                verticalLineToRelative(-0.08f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, false, -0.07f, -0.16f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, -0.05f, -0.08f)
                lineToRelative(-0.1f, -0.13f)
                lineToRelative(-0.08f, -0.06f)
                lineToRelative(-0.12f, -0.09f)
                lineToRelative(-9.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.0f)
                lineToRelative(-9.0f, 5.0f)
                lineToRelative(-0.09f, 0.07f)
                lineToRelative(-0.11f, 0.08f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.07f, 0.11f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.08f, 0.1f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.06f, 0.14f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.0f, 0.1f)
                arcTo(0.76f, 0.76f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.52f, 0.87f)
                lineToRelative(9.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.13f, 0.06f)
                horizontalLineToRelative(0.1f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, 0.5f, 0.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.14f, -0.06f)
                lineToRelative(9.0f, -5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 16.0f)
                lineTo(22.0f, 8.0f)
                close()
                moveTo(12.0f, 11.87f)
                lineTo(5.06f, 8.0f)
                lineToRelative(2.76f, -1.52f)
                lineToRelative(6.83f, 3.9f)
                close()
                moveTo(12.0f, 4.15f)
                lineTo(18.94f, 8.0f)
                lineTo(16.7f, 9.25f)
                lineTo(9.87f, 5.34f)
                close()
                moveTo(4.0f, 9.7f)
                lineToRelative(7.0f, 3.92f)
                verticalLineToRelative(5.68f)
                lineToRelative(-7.0f, -3.89f)
                close()
                moveTo(13.0f, 19.3f)
                verticalLineToRelative(-5.68f)
                lineToRelative(3.0f, -1.68f)
                lineTo(16.0f, 15.0f)
                lineToRelative(2.0f, -1.0f)
                verticalLineToRelative(-3.18f)
                lineToRelative(2.0f, -1.11f)
                verticalLineToRelative(5.7f)
                close()
            }
        }
        .build()
        return _bxPackage!!
    }

private var _bxPackage: ImageVector? = null
