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

public val Twbs.CupFill: ImageVector
    get() {
        if (_cupFill != null) {
            return _cupFill!!
        }
        _cupFill = Builder(name = "CupFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.11f, 3.187f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.488f, 0.608f)
                lineToRelative(-0.22f, 0.991f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -1.3f, 5.854f)
                lineToRelative(-0.132f, 0.59f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.896f, 13.0f)
                lineTo(4.104f, 13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.44f, -1.958f)
                lineTo(0.012f, 3.608f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.098f, -0.42f)
                close()
                moveTo(12.684f, 9.475f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.866f, -3.899f)
                close()
            }
        }
        .build()
        return _cupFill!!
    }

private var _cupFill: ImageVector? = null
