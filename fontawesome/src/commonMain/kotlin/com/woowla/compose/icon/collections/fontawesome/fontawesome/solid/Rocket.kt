package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 320.0f)
                lineTo(24.5f, 320.0f)
                curveToRelative(-24.9f, 0.0f, -40.2f, -27.1f, -27.4f, -48.5f)
                lineTo(50.0f, 183.3f)
                curveTo(58.7f, 168.8f, 74.3f, 160.0f, 91.2f, 160.0f)
                lineToRelative(95.0f, 0.0f)
                curveToRelative(76.1f, -128.9f, 189.6f, -135.4f, 265.5f, -124.3f)
                curveToRelative(12.8f, 1.9f, 22.8f, 11.9f, 24.6f, 24.6f)
                curveToRelative(11.1f, 75.9f, 4.6f, 189.4f, -124.3f, 265.5f)
                lineToRelative(0.0f, 95.0f)
                curveToRelative(0.0f, 16.9f, -8.8f, 32.5f, -23.3f, 41.2f)
                lineToRelative(-88.2f, 52.9f)
                curveToRelative(-21.3f, 12.8f, -48.5f, -2.6f, -48.5f, -27.4f)
                lineTo(192.0f, 384.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-0.1f, 0.0f)
                close()
                moveTo(400.0f, 160.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
