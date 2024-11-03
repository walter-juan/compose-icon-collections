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

public val Twbs.GiftFill: ImageVector
    get() {
        if (_giftFill != null) {
            return _giftFill!!
        }
        _giftFill = Builder(name = "GiftFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(0.006f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.27f, -0.038f, 0.494f)
                lineTo(15.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(1.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(0.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.038f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 2.506f)
                close()
                moveTo(4.068f, 3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                curveToRelative(0.0f, 0.085f, 0.002f, 0.274f, 0.045f, 0.43f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(2.932f)
                lineToRelative(0.023f, -0.07f)
                curveToRelative(0.043f, -0.156f, 0.045f, -0.345f, 0.045f, -0.43f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                close()
                moveTo(15.0f, 7.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(9.0f, 16.0f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(2.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 14.5f)
                lineTo(1.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _giftFill!!
    }

private var _giftFill: ImageVector? = null
