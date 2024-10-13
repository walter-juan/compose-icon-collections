package com.woowla.compose.icon.collections.devicons.devicons.vscode

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VscodeGroup

public val VscodeGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(90.77f, 127.13f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, 6.35f, -0.24f)
                lineToRelative(26.35f, -12.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.53f, -7.21f)
                lineTo(128.0f, 21.01f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.53f, -7.21f)
                lineTo(97.12f, 1.12f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, -9.09f, 1.55f)
                lineToRelative(-50.45f, 46.03f)
                lineTo(15.6f, 32.01f)
                arcToRelative(5.33f, 5.33f, 0.0f, false, false, -6.81f, 0.3f)
                lineToRelative(-7.05f, 6.41f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, false, -0.01f, 7.89f)
                lineTo(20.8f, 64.0f)
                lineTo(1.74f, 81.39f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, false, 0.01f, 7.89f)
                lineToRelative(7.05f, 6.41f)
                arcToRelative(5.33f, 5.33f, 0.0f, false, false, 6.81f, 0.3f)
                lineToRelative(21.97f, -16.68f)
                lineToRelative(50.45f, 46.03f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, 2.74f, 1.79f)
                close()
                moveTo(96.02f, 34.94f)
                lineTo(57.74f, 64.0f)
                lineToRelative(38.28f, 29.06f)
                lineTo(96.02f, 34.94f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
