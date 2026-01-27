package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.SmileyFrown16: ImageVector
    get() {
        if (_smileyFrown16 != null) {
            return _smileyFrown16!!
        }
        _smileyFrown16 = Builder(name = "SmileyFrown16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                close()
                moveTo(8.0f, 1.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                close()
                moveTo(8.0f, 9.496f)
                arcToRelative(3.775f, 3.775f, 0.0f, false, true, 2.127f, 0.629f)
                curveToRelative(0.192f, 0.13f, 0.37f, 0.279f, 0.53f, 0.445f)
                curveToRelative(0.066f, 0.067f, 0.128f, 0.138f, 0.184f, 0.213f)
                lineToRelative(0.015f, 0.019f)
                lineToRelative(0.004f, 0.008f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(0.001f, 0.002f)
                verticalLineToRelative(0.001f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, -0.07f, 0.05f)
                lineToRelative(0.071f, -0.05f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -0.175f, 1.046f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.047f, -0.175f)
                lineToRelative(-0.007f, -0.009f)
                arcToRelative(1.843f, 1.843f, 0.0f, false, false, -0.35f, -0.31f)
                curveToRelative(-0.265f, -0.179f, -0.683f, -0.371f, -1.285f, -0.371f)
                curveToRelative(-0.602f, 0.0f, -1.021f, 0.192f, -1.285f, 0.37f)
                arcToRelative(1.843f, 1.843f, 0.0f, false, false, -0.35f, 0.31f)
                lineToRelative(-0.007f, 0.01f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -1.038f, 0.174f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.183f, -1.044f)
                lineToRelative(0.614f, 0.43f)
                lineToRelative(-0.612f, -0.432f)
                verticalLineToRelative(-0.002f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(0.005f, -0.007f)
                lineToRelative(0.014f, -0.02f)
                arcToRelative(3.31f, 3.31f, 0.0f, false, true, 0.715f, -0.657f)
                curveToRelative(0.474f, -0.322f, 1.18f, -0.63f, 2.126f, -0.63f)
                close()
                moveTo(5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 1.998f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 6.0f)
                close()
                moveTo(11.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 1.998f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 6.0f)
                close()
            }
        }
        .build()
        return _smileyFrown16!!
    }

private var _smileyFrown16: ImageVector? = null
