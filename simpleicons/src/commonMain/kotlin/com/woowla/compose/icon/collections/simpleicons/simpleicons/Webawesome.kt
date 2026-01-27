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

public val Simpleicons.Webawesome: ImageVector
    get() {
        if (_webawesome != null) {
            return _webawesome!!
        }
        _webawesome = Builder(name = "Webawesome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.958f, 4.95f)
                curveToRelative(0.0f, 0.783f, -0.465f, 1.462f, -1.132f, 1.77f)
                lineTo(16.8f, 10.2f)
                lineToRelative(3.914f, -0.784f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 20.4f, 8.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, true, true, 1.86f, 1.8f)
                lineToRelative(-4.221f, 9.385f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 15.849f, 21.0f)
                horizontalLineTo(8.153f)
                curveToRelative(-0.945f, 0.0f, -1.8f, -0.555f, -2.19f, -1.414f)
                lineToRelative(-4.221f, -9.384f)
                arcToRelative(1.8f, 1.8f, 0.0f, true, true, 1.545f, -0.784f)
                lineTo(7.2f, 10.2f)
                lineToRelative(3.98f, -3.484f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, true, -1.125f, -1.766f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, true, 3.9f, 0.0f)
                close()
            }
        }
        .build()
        return _webawesome!!
    }

private var _webawesome: ImageVector? = null
