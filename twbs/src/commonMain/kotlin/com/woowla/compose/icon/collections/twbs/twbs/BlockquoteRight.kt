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

public val Twbs.BlockquoteRight: ImageVector
    get() {
        if (_blockquoteRight != null) {
            return _blockquoteRight!!
        }
        _blockquoteRight = Builder(name = "BlockquoteRight", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(2.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(2.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(2.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(12.613f, 6.627f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.445f, -0.275f)
                lineToRelative(0.21f, -0.352f)
                quadToRelative(0.183f, 0.111f, 0.452f, 0.287f)
                quadToRelative(0.27f, 0.176f, 0.51f, 0.428f)
                quadToRelative(0.234f, 0.246f, 0.398f, 0.562f)
                quadToRelative(0.164f, 0.31f, 0.164f, 0.692f)
                quadToRelative(0.0f, 0.54f, -0.216f, 0.873f)
                quadToRelative(-0.217f, 0.328f, -0.721f, 0.328f)
                quadToRelative(-0.322f, 0.0f, -0.504f, -0.211f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.188f, -0.463f)
                quadToRelative(0.0f, -0.345f, 0.211f, -0.521f)
                quadToRelative(0.205f, -0.182f, 0.569f, -0.182f)
                horizontalLineToRelative(0.281f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.123f, -0.498f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.252f, -0.37f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.346f, -0.298f)
                moveToRelative(-2.168f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 10.0f, 6.352f)
                lineTo(10.21f, 6.0f)
                quadToRelative(0.183f, 0.111f, 0.452f, 0.287f)
                quadToRelative(0.27f, 0.176f, 0.51f, 0.428f)
                quadToRelative(0.234f, 0.246f, 0.398f, 0.562f)
                quadToRelative(0.164f, 0.31f, 0.164f, 0.692f)
                quadToRelative(0.0f, 0.54f, -0.216f, 0.873f)
                quadToRelative(-0.217f, 0.328f, -0.721f, 0.328f)
                quadToRelative(-0.322f, 0.0f, -0.504f, -0.211f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.188f, -0.463f)
                quadToRelative(0.0f, -0.345f, 0.211f, -0.521f)
                quadToRelative(0.206f, -0.182f, 0.569f, -0.182f)
                horizontalLineToRelative(0.281f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.117f, -0.492f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.258f, -0.375f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.346f, -0.3f)
                close()
            }
        }
        .build()
        return _blockquoteRight!!
    }

private var _blockquoteRight: ImageVector? = null
