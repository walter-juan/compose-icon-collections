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

public val Twbs.MapFill: ImageVector
    get() {
        if (_mapFill != null) {
            return _mapFill!!
        }
        _mapFill = Builder(name = "MapFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.598f, -0.49f)
                lineTo(10.5f, 0.99f)
                lineTo(5.598f, 0.01f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.196f, 0.0f)
                lineToRelative(-5.0f, 1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.5f)
                verticalLineToRelative(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.598f, 0.49f)
                lineToRelative(4.902f, -0.98f)
                lineToRelative(4.902f, 0.98f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.196f, 0.0f)
                lineToRelative(5.0f, -1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.0f, 14.5f)
                close()
                moveTo(5.0f, 14.09f)
                lineTo(5.0f, 1.11f)
                lineToRelative(0.5f, -0.1f)
                lineToRelative(0.5f, 0.1f)
                verticalLineToRelative(12.98f)
                lineToRelative(-0.402f, -0.08f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.196f, 0.0f)
                close()
                moveTo(10.0f, 14.89f)
                lineTo(10.0f, 1.91f)
                lineToRelative(0.402f, 0.08f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.196f, 0.0f)
                lineTo(11.0f, 1.91f)
                verticalLineToRelative(12.98f)
                lineToRelative(-0.5f, 0.1f)
                close()
            }
        }
        .build()
        return _mapFill!!
    }

private var _mapFill: ImageVector? = null
