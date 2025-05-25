package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Perplexity: ImageVector
    get() {
        if (_perplexity != null) {
            return _perplexity!!
        }
        _perplexity = Builder(name = "Perplexity", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 0.188f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.503f, 0.5f)
                lineTo(8.503f, 4.03f)
                lineToRelative(3.022f, -2.92f)
                lineToRelative(0.059f, -0.048f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.49f, -0.054f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.306f, 0.46f)
                verticalLineToRelative(3.247f)
                horizontalLineToRelative(1.117f)
                lineToRelative(0.1f, 0.01f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.403f, 0.49f)
                verticalLineToRelative(5.558f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.503f, 0.5f)
                lineTo(12.38f, 11.273f)
                verticalLineToRelative(3.258f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.312f, 0.462f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.55f, -0.11f)
                lineToRelative(-3.016f, -3.018f)
                verticalLineToRelative(3.448f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.503f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.503f, -0.5f)
                verticalLineToRelative(-3.448f)
                lineToRelative(-3.018f, 3.019f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.548f, 0.11f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.312f, -0.463f)
                verticalLineToRelative(-3.258f)
                lineTo(2.503f, 11.273f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.503f, -0.5f)
                lineTo(2.0f, 5.215f)
                lineToRelative(0.01f, -0.1f)
                curveToRelative(0.047f, -0.229f, 0.25f, -0.4f, 0.493f, -0.4f)
                lineTo(3.62f, 4.715f)
                lineTo(3.62f, 1.469f)
                lineToRelative(0.006f, -0.074f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.302f, -0.387f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.547f, 0.102f)
                lineToRelative(3.023f, 2.92f)
                lineTo(7.498f, 0.687f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.503f, -0.5f)
                moveTo(4.626f, 9.333f)
                verticalLineToRelative(3.984f)
                lineToRelative(2.87f, -2.872f)
                verticalLineToRelative(-4.01f)
                close()
                moveTo(8.503f, 10.446f)
                lineTo(11.374f, 13.317f)
                lineTo(11.374f, 9.333f)
                lineToRelative(-2.87f, -2.897f)
                close()
                moveTo(12.236f, 8.778f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.145f, 0.35f)
                verticalLineToRelative(1.145f)
                horizontalLineToRelative(0.612f)
                lineTo(12.993f, 5.715f)
                lineTo(9.201f, 5.715f)
                close()
                moveTo(3.006f, 10.273f)
                horizontalLineToRelative(0.613f)
                lineTo(3.619f, 9.13f)
                curveToRelative(0.0f, -0.131f, 0.052f, -0.257f, 0.145f, -0.35f)
                lineToRelative(3.033f, -3.064f)
                horizontalLineToRelative(-3.79f)
                close()
                moveTo(4.626f, 4.715f)
                lineTo(6.76f, 4.715f)
                lineTo(4.626f, 2.652f)
                close()
                moveTo(9.239f, 4.715f)
                horizontalLineToRelative(2.134f)
                lineTo(11.373f, 2.652f)
                close()
            }
        }
        .build()
        return _perplexity!!
    }

private var _perplexity: ImageVector? = null
