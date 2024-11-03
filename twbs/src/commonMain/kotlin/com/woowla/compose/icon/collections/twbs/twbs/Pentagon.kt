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

public val Twbs.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.685f, 1.545f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.63f, 0.0f)
                lineToRelative(6.263f, 5.088f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.161f, 0.539f)
                lineToRelative(-2.362f, 7.479f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.476f, 0.349f)
                lineTo(4.099f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.476f, -0.35f)
                lineTo(1.26f, 7.173f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.161f, -0.54f)
                lineToRelative(6.263f, -5.087f)
                close()
                moveTo(15.898f, 6.825f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.162f, -0.54f)
                lineTo(8.316f, 0.257f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.631f, 0.0f)
                lineTo(0.264f, 6.286f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.162f, 0.538f)
                lineToRelative(2.788f, 8.827f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.476f, 0.349f)
                horizontalLineToRelative(9.268f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.476f, -0.35f)
                lineToRelative(2.788f, -8.826f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
