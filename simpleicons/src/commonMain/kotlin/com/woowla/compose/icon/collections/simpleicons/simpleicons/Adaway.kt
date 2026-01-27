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

public val Simpleicons.Adaway: ImageVector
    get() {
        if (_adaway != null) {
            return _adaway!!
        }
        _adaway = Builder(name = "Adaway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.049f, 0.0f)
                lineTo(0.014f, 7.016f)
                lineTo(0.0f, 16.951f)
                lineToRelative(7.016f, 7.035f)
                lineToRelative(9.935f, 0.014f)
                lineToRelative(7.035f, -7.015f)
                lineTo(24.0f, 7.049f)
                lineTo(16.984f, 0.014f)
                close()
                moveTo(5.179f, 6.52f)
                curveToRelative(0.456f, -0.046f, 2.886f, 0.98f, 5.768f, 0.99f)
                curveToRelative(1.48f, 0.091f, 2.039f, 0.52f, 2.455f, 0.956f)
                curveToRelative(0.932f, 0.878f, 1.135f, 1.324f, 2.315f, 0.755f)
                curveToRelative(0.48f, -0.231f, 1.072f, -1.6f, 1.739f, -1.747f)
                curveToRelative(0.52f, -0.076f, 1.283f, 0.58f, 1.474f, 0.77f)
                curveToRelative(0.21f, 0.205f, 0.399f, 0.396f, 0.598f, 0.487f)
                curveToRelative(-0.684f, 0.037f, -1.632f, 1.634f, -1.657f, 2.99f)
                curveToRelative(0.137f, 3.791f, -1.57f, 3.582f, -3.248f, 5.437f)
                curveToRelative(-0.535f, 0.51f, -0.836f, 1.578f, -0.836f, 2.553f)
                lineToRelative(-0.705f, -0.021f)
                curveToRelative(-0.418f, 0.01f, -0.895f, -0.535f, -1.126f, -0.899f)
                curveToRelative(-0.44f, -0.735f, -0.897f, 0.673f, -1.583f, -0.48f)
                curveToRelative(0.031f, -0.383f, -1.833f, -0.457f, -0.762f, -1.348f)
                curveToRelative(2.53f, -1.79f, 3.764f, -2.168f, 3.711f, -2.708f)
                curveToRelative(-0.062f, -0.638f, -1.545f, -0.06f, -2.884f, -0.122f)
                curveToRelative(-2.213f, -0.102f, -1.97f, -1.504f, -2.166f, -2.157f)
                curveToRelative(-1.857f, -1.034f, 1.428f, -1.52f, -0.015f, -1.826f)
                curveToRelative(-0.705f, -0.111f, -1.949f, 0.15f, -2.21f, -1.069f)
                curveToRelative(0.235f, 0.291f, 3.32f, -0.304f, 2.077f, -0.498f)
                curveToRelative(-1.725f, -0.783f, -2.21f, -0.364f, -2.926f, -1.835f)
                curveToRelative(-0.124f, -0.15f, -0.124f, -0.218f, -0.019f, -0.228f)
                close()
                moveTo(17.754f, 8.423f)
                arcToRelative(0.261f, 0.261f, 0.0f, false, false, -0.26f, 0.26f)
                arcToRelative(0.261f, 0.261f, 0.0f, false, false, 0.26f, 0.262f)
                arcToRelative(0.261f, 0.261f, 0.0f, false, false, 0.261f, -0.261f)
                arcToRelative(0.261f, 0.261f, 0.0f, false, false, -0.26f, -0.261f)
                close()
            }
        }
        .build()
        return _adaway!!
    }

private var _adaway: ImageVector? = null
