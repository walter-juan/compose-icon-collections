package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Perplexity: ImageVector
    get() {
        if (_perplexity != null) {
            return _perplexity!!
        }
        _perplexity = Builder(name = "Perplexity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.398f, 7.09f)
                horizontalLineToRelative(-2.311f)
                lineTo(20.087f, 0.068f)
                lineToRelative(-7.509f, 6.354f)
                lineTo(12.578f, 0.158f)
                horizontalLineToRelative(-1.155f)
                verticalLineToRelative(6.197f)
                lineTo(4.49f, 0.0f)
                verticalLineToRelative(7.09f)
                lineTo(1.602f, 7.09f)
                verticalLineToRelative(10.398f)
                horizontalLineToRelative(2.888f)
                lineTo(4.49f, 24.0f)
                lineToRelative(6.932f, -6.359f)
                verticalLineToRelative(6.201f)
                horizontalLineToRelative(1.155f)
                verticalLineToRelative(-6.047f)
                lineToRelative(6.932f, 6.181f)
                verticalLineToRelative(-6.488f)
                horizontalLineToRelative(2.888f)
                lineTo(22.398f, 7.09f)
                close()
                moveTo(18.932f, 2.559f)
                verticalLineToRelative(4.531f)
                horizontalLineToRelative(-5.355f)
                lineToRelative(5.355f, -4.531f)
                close()
                moveTo(5.646f, 2.626f)
                lineTo(10.515f, 7.09f)
                lineTo(5.646f, 7.09f)
                lineTo(5.646f, 2.626f)
                close()
                moveTo(2.758f, 16.332f)
                lineTo(2.758f, 8.245f)
                horizontalLineToRelative(7.848f)
                lineToRelative(-6.115f, 6.115f)
                verticalLineToRelative(1.972f)
                lineTo(2.758f, 16.332f)
                close()
                moveTo(5.646f, 21.372f)
                verticalLineToRelative(-3.885f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-2.649f)
                lineToRelative(5.776f, -5.776f)
                verticalLineToRelative(7.011f)
                lineToRelative(-5.776f, 5.299f)
                close()
                moveTo(18.354f, 21.397f)
                lineTo(12.578f, 16.246f)
                lineTo(12.578f, 9.062f)
                lineToRelative(5.777f, 5.777f)
                verticalLineToRelative(6.559f)
                close()
                moveTo(21.243f, 16.332f)
                horizontalLineToRelative(-1.733f)
                verticalLineToRelative(-1.972f)
                lineTo(13.395f, 8.245f)
                horizontalLineToRelative(7.848f)
                verticalLineToRelative(8.087f)
                close()
            }
        }
        .build()
        return _perplexity!!
    }

private var _perplexity: ImageVector? = null
