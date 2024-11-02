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

public val Simpleicons.Sifive: ImageVector
    get() {
        if (_sifive != null) {
            return _sifive!!
        }
        _sifive = Builder(name = "Sifive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.906f, 12.408f)
                lineTo(6.024f, 2.737f)
                horizontalLineToRelative(11.951f)
                lineToRelative(1.213f, 3.762f)
                horizontalLineTo(8.632f)
                lineToRelative(-0.675f, 2.134f)
                horizontalLineToRelative(11.92f)
                lineToRelative(1.792f, 5.558f)
                lineTo(12.0f, 21.319f)
                lineToRelative(-9.189f, -6.777f)
                horizontalLineToRelative(6.205f)
                lineToRelative(2.957f, 2.181f)
                lineToRelative(5.851f, -4.313f)
                lineToRelative(-14.917f, -0.002f)
                close()
                moveTo(19.417f, 0.443f)
                horizontalLineTo(4.583f)
                lineTo(0.0f, 14.731f)
                lineToRelative(12.0f, 8.827f)
                lineToRelative(12.0f, -8.83f)
                lineTo(19.417f, 0.443f)
                close()
            }
        }
        .build()
        return _sifive!!
    }

private var _sifive: ImageVector? = null
