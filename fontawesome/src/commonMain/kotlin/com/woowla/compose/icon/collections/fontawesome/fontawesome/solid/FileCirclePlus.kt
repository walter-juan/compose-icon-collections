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

public val SolidGroup.FileCirclePlus: ImageVector
    get() {
        if (_fileCirclePlus != null) {
            return _fileCirclePlus!!
        }
        _fileCirclePlus = Builder(name = "FileCirclePlus", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(224.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, 38.6f)
                curveTo(310.1f, 219.5f, 256.0f, 287.4f, 256.0f, 368.0f)
                curveToRelative(0.0f, 59.1f, 29.1f, 111.3f, 73.7f, 143.3f)
                curveToRelative(-3.2f, 0.5f, -6.4f, 0.7f, -9.7f, 0.7f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(384.0f, 128.0f)
                lineToRelative(-128.0f, 0.0f)
                lineTo(256.0f, 0.0f)
                lineTo(384.0f, 128.0f)
                close()
                moveTo(432.0f, 224.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, 288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, -288.0f)
                close()
                moveTo(448.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _fileCirclePlus!!
    }

private var _fileCirclePlus: ImageVector? = null
