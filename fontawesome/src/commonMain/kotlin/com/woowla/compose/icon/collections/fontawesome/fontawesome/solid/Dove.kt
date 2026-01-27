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

public val SolidGroup.Dove: ImageVector
    get() {
        if (_dove != null) {
            return _dove!!
        }
        _dove = Builder(name = "Dove", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 64.0f)
                curveToRelative(13.2f, 0.0f, 20.7f, 15.1f, 12.8f, 25.6f)
                lineTo(480.0f, 128.0f)
                lineTo(480.0f, 304.0f)
                curveToRelative(0.0f, 79.5f, -64.5f, 144.0f, -144.0f, 144.0f)
                lineToRelative(-112.0f, 0.0f)
                lineToRelative(-46.3f, 46.3f)
                curveToRelative(-10.4f, 10.4f, -26.5f, 12.4f, -39.1f, 4.8f)
                lineTo(41.5f, 440.9f)
                curveToRelative(-17.0f, -10.2f, -15.0f, -35.5f, 3.4f, -42.9f)
                lineTo(160.0f, 352.0f)
                curveTo(23.8f, 311.1f, 7.5f, 169.8f, 22.0f, 95.7f)
                curveTo(25.6f, 77.9f, 45.3f, 71.4f, 61.3f, 80.2f)
                lineTo(320.0f, 224.0f)
                lineTo(320.0f, 144.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                lineToRelative(96.0f, 0.0f)
                close()
                moveTo(400.0f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                close()
                moveTo(182.5f, -9.6f)
                curveToRelative(12.4f, -13.7f, 33.3f, -8.9f, 42.5f, 7.1f)
                lineToRelative(56.4f, 98.3f)
                curveToRelative(-5.8f, 14.4f, -9.2f, 30.1f, -9.4f, 46.5f)
                lineTo(138.1f, 68.0f)
                curveToRelative(10.1f, -31.6f, 27.0f, -58.4f, 44.4f, -77.6f)
                close()
            }
        }
        .build()
        return _dove!!
    }

private var _dove: ImageVector? = null
