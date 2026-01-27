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

public val SolidGroup.LaptopFile: ImageVector
    get() {
        if (_laptopFile != null) {
            return _laptopFile!!
        }
        _laptopFile = Builder(name = "LaptopFile", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveTo(64.0f, 28.7f, 92.7f, 0.0f, 128.0f, 0.0f)
                lineTo(416.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-288.0f, 0.0f)
                lineToRelative(0.0f, 192.0f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-163.2f, 0.0f)
                curveTo(34.4f, 352.0f, 0.0f, 317.6f, 0.0f, 275.2f)
                curveTo(0.0f, 264.6f, 8.6f, 256.0f, 19.2f, 256.0f)
                lineTo(64.0f, 256.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(529.9f, 257.9f)
                curveToRelative(9.0f, 9.0f, 14.1f, 21.2f, 14.1f, 33.9f)
                lineTo(544.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-160.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(76.1f, 0.0f)
                curveToRelative(12.7f, 0.0f, 24.9f, 5.1f, 33.9f, 14.1f)
                curveToRelative(20.0f, 20.0f, 47.9f, 47.9f, 83.9f, 83.9f)
                close()
                moveTo(416.0f, 272.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(60.1f, 0.0f)
                lineToRelative(-76.1f, -76.1f)
                lineToRelative(0.0f, 60.1f)
                close()
            }
        }
        .build()
        return _laptopFile!!
    }

private var _laptopFile: ImageVector? = null
