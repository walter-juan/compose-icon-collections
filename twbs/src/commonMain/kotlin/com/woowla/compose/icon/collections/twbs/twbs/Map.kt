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

public val Twbs.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.817f, 0.113f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 16.0f, 0.5f)
                verticalLineToRelative(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.402f, 0.49f)
                lineToRelative(-5.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.196f, 0.0f)
                lineTo(5.5f, 15.01f)
                lineToRelative(-4.902f, 0.98f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.0f, 15.5f)
                verticalLineToRelative(-14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.402f, -0.49f)
                lineToRelative(5.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.196f, 0.0f)
                lineTo(10.5f, 0.99f)
                lineToRelative(4.902f, -0.98f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.415f, 0.103f)
                moveTo(10.0f, 1.91f)
                lineToRelative(-4.0f, -0.8f)
                verticalLineToRelative(12.98f)
                lineToRelative(4.0f, 0.8f)
                close()
                moveTo(11.0f, 14.89f)
                lineTo(15.0f, 14.09f)
                lineTo(15.0f, 1.11f)
                lineToRelative(-4.0f, 0.8f)
                close()
                moveTo(5.0f, 14.09f)
                lineTo(5.0f, 1.11f)
                lineToRelative(-4.0f, 0.8f)
                verticalLineToRelative(12.98f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
