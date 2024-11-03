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

public val Twbs.BlockquoteLeft: ImageVector
    get() {
        if (_blockquoteLeft != null) {
            return _blockquoteLeft!!
        }
        _blockquoteLeft = Builder(name = "BlockquoteLeft", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(7.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(7.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(2.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(3.29f, 6.627f)
                quadToRelative(0.168f, -0.117f, 0.444f, -0.275f)
                lineTo(3.524f, 6.0f)
                quadToRelative(-0.183f, 0.111f, -0.452f, 0.287f)
                quadToRelative(-0.27f, 0.176f, -0.51f, 0.428f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.398f, 0.562f)
                quadTo(2.0f, 7.587f, 2.0f, 7.969f)
                quadToRelative(0.0f, 0.54f, 0.217f, 0.873f)
                quadToRelative(0.217f, 0.328f, 0.72f, 0.328f)
                quadToRelative(0.322f, 0.0f, 0.504f, -0.211f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.188f, -0.463f)
                quadToRelative(0.0f, -0.345f, -0.211f, -0.521f)
                quadToRelative(-0.205f, -0.182f, -0.568f, -0.182f)
                horizontalLineToRelative(-0.282f)
                quadToRelative(0.036f, -0.305f, 0.123f, -0.498f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 0.252f, -0.37f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.346f, -0.298f)
                close()
                moveTo(5.457f, 6.627f)
                quadToRelative(0.17f, -0.117f, 0.445f, -0.275f)
                lineTo(5.692f, 6.0f)
                quadToRelative(-0.183f, 0.111f, -0.452f, 0.287f)
                quadToRelative(-0.27f, 0.176f, -0.51f, 0.428f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.398f, 0.562f)
                quadToRelative(-0.165f, 0.31f, -0.164f, 0.692f)
                quadToRelative(0.0f, 0.54f, 0.217f, 0.873f)
                quadToRelative(0.217f, 0.328f, 0.72f, 0.328f)
                quadToRelative(0.322f, 0.0f, 0.504f, -0.211f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.188f, -0.463f)
                quadToRelative(0.0f, -0.345f, -0.211f, -0.521f)
                quadToRelative(-0.205f, -0.182f, -0.568f, -0.182f)
                horizontalLineToRelative(-0.282f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.118f, -0.492f)
                quadToRelative(0.087f, -0.194f, 0.257f, -0.375f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.346f, -0.3f)
                close()
            }
        }
        .build()
        return _blockquoteLeft!!
    }

private var _blockquoteLeft: ImageVector? = null
