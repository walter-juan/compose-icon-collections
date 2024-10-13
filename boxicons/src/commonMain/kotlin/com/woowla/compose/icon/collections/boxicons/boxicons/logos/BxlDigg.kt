package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlDigg: ImageVector
    get() {
        if (_bxlDigg != null) {
            return _bxlDigg!!
        }
        _bxlDigg = Builder(name = "BxlDigg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.803f, 8.8f)
                verticalLineToRelative(6.801f)
                horizontalLineToRelative(3.2f)
                verticalLineToRelative(0.799f)
                horizontalLineToRelative(-3.2f)
                verticalLineToRelative(1.602f)
                horizontalLineToRelative(5.2f)
                lineTo(22.003f, 8.8f)
                horizontalLineToRelative(-5.2f)
                close()
                moveTo(10.803f, 8.8f)
                verticalLineToRelative(6.801f)
                horizontalLineToRelative(3.199f)
                verticalLineToRelative(0.799f)
                horizontalLineToRelative(-3.199f)
                verticalLineToRelative(1.602f)
                horizontalLineToRelative(5.199f)
                lineTo(16.002f, 8.8f)
                horizontalLineToRelative(-5.199f)
                close()
                moveTo(5.2f, 5.999f)
                lineTo(5.2f, 8.8f)
                lineTo(2.0f, 8.8f)
                verticalLineToRelative(6.801f)
                horizontalLineToRelative(5.201f)
                lineTo(7.201f, 5.999f)
                lineTo(5.2f, 5.999f)
                close()
                moveTo(10.001f, 8.8f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.801f)
                horizontalLineToRelative(2.0f)
                lineTo(10.001f, 8.8f)
                close()
                moveTo(20.003f, 14.0f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-3.601f)
                horizontalLineToRelative(1.2f)
                lineTo(20.003f, 14.0f)
                close()
                moveTo(5.2f, 14.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-3.601f)
                horizontalLineToRelative(1.2f)
                lineTo(5.2f, 14.0f)
                close()
                moveTo(14.002f, 14.0f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-3.601f)
                horizontalLineToRelative(1.2f)
                lineTo(14.002f, 14.0f)
                close()
                moveTo(10.001f, 5.999f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxlDigg!!
    }

private var _bxlDigg: ImageVector? = null
