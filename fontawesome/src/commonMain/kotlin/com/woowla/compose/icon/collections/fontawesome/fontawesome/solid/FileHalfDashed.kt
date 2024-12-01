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
                lineTo(0.0f, 320.0f)
                lineToRelative(384.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(224.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(256.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(128.0f, 0.0f)
                lineTo(256.0f, 0.0f)
                close()
                moveTo(0.0f, 416.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineTo(0.0f, 352.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(288.0f, 448.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(176.0f, 448.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(64.0f, 448.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(320.0f, 448.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(384.0f, 416.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fileHalfDashed!!
    }

private var _fileHalfDashed: ImageVector? = null
