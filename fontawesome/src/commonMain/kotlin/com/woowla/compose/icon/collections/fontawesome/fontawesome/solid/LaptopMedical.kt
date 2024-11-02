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

public val SolidGroup.LaptopMedical: ImageVector
    get() {
        if (_laptopMedical != null) {
            return _laptopMedical!!
        }
        _laptopMedical = Builder(name = "LaptopMedical", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 256.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -256.0f)
                lineTo(128.0f, 96.0f)
                lineToRelative(0.0f, 256.0f)
                lineToRelative(-64.0f, 0.0f)
                lineTo(64.0f, 96.0f)
                close()
                moveTo(0.0f, 403.2f)
                curveTo(0.0f, 392.6f, 8.6f, 384.0f, 19.2f, 384.0f)
                lineToRelative(601.6f, 0.0f)
                curveToRelative(10.6f, 0.0f, 19.2f, 8.6f, 19.2f, 19.2f)
                curveToRelative(0.0f, 42.4f, -34.4f, 76.8f, -76.8f, 76.8f)
                lineTo(76.8f, 480.0f)
                curveTo(34.4f, 480.0f, 0.0f, 445.6f, 0.0f, 403.2f)
                close()
                moveTo(288.0f, 160.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _laptopMedical!!
    }

private var _laptopMedical: ImageVector? = null
