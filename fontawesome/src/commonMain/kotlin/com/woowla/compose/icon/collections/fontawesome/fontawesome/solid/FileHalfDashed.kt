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

public val SolidGroup.FileHalfDashed: ImageVector
    get() {
        if (_fileHalfDashed != null) {
            return _fileHalfDashed!!
        }
        _fileHalfDashed = Builder(name = "FileHalfDashed", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineToRelative(0.0f, 256.0f)
                lineToRelative(384.0f, 0.0f)
                lineToRelative(0.0f, -149.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(258.7f, 18.7f)
                curveTo(246.7f, 6.7f, 230.5f, 0.0f, 213.5f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(325.5f, 176.0f)
                lineTo(232.0f, 176.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(208.0f, 58.5f)
                lineTo(325.5f, 176.0f)
                close()
                moveTo(0.0f, 352.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(64.0f, 512.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(96.0f, 512.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(208.0f, 512.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(320.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(384.0f, 352.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _fileHalfDashed!!
    }

private var _fileHalfDashed: ImageVector? = null
