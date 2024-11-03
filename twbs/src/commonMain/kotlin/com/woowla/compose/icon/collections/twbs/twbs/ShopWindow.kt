package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.ShopWindow: ImageVector
    get() {
        if (_shopWindow != null) {
            return _shopWindow!!
        }
        _shopWindow = Builder(name = "ShopWindow", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.97f, 1.35f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.73f, 1.0f)
                horizontalLineToRelative(8.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.76f, 0.35f)
                lineToRelative(2.609f, 3.044f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 5.37f)
                verticalLineToRelative(0.255f)
                arcToRelative(2.375f, 2.375f, 0.0f, false, true, -4.25f, 1.458f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 9.875f, 8.0f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 8.0f, 7.083f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 6.125f, 8.0f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, true, -1.875f, -0.917f)
                arcTo(2.375f, 2.375f, 0.0f, false, true, 0.0f, 5.625f)
                lineTo(0.0f, 5.37f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.361f, -0.976f)
                close()
                moveTo(4.75f, 5.625f)
                arcToRelative(1.375f, 1.375f, 0.0f, false, false, 2.75f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                arcToRelative(1.375f, 1.375f, 0.0f, false, false, 2.75f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                arcToRelative(1.375f, 1.375f, 0.0f, true, false, 2.75f, 0.0f)
                lineTo(15.0f, 5.37f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.12f, -0.325f)
                lineTo(12.27f, 2.0f)
                lineTo(3.73f, 2.0f)
                lineTo(1.12f, 5.045f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 1.0f, 5.37f)
                verticalLineToRelative(0.255f)
                arcToRelative(1.375f, 1.375f, 0.0f, false, false, 2.75f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                moveTo(1.5f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(12.0f)
                lineTo(14.0f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(0.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(1.0f, 15.0f)
                lineTo(1.0f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveToRelative(2.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(4.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                lineTo(12.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _shopWindow!!
    }

private var _shopWindow: ImageVector? = null
