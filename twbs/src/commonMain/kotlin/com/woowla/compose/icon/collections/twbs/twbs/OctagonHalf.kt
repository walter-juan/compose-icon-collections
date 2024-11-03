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

public val Twbs.OctagonHalf: ImageVector
    get() {
        if (_octagonHalf != null) {
            return _octagonHalf!!
        }
        _octagonHalf = Builder(name = "OctagonHalf", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.54f, 0.146f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.893f, 0.0f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.353f, 0.146f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, 0.353f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.146f, 0.353f)
                lineToRelative(-4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.353f, 0.146f)
                horizontalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.353f, -0.146f)
                lineTo(0.146f, 11.46f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.0f, 11.107f)
                verticalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, -0.353f)
                close()
                moveTo(8.0f, 15.0f)
                horizontalLineToRelative(2.9f)
                lineToRelative(4.1f, -4.1f)
                verticalLineTo(5.1f)
                lineTo(10.9f, 1.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _octagonHalf!!
    }

private var _octagonHalf: ImageVector? = null
