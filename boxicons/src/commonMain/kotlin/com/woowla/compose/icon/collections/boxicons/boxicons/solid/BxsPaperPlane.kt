package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPaperPlane: ImageVector
    get() {
        if (_bxsPaperPlane != null) {
            return _bxsPaperPlane!!
        }
        _bxsPaperPlane = Builder(name = "BxsPaperPlane", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.6f, 13.083f)
                lineToRelative(3.452f, 1.511f)
                lineTo(16.0f, 9.167f)
                lineToRelative(-6.0f, 7.0f)
                lineToRelative(8.6f, 3.916f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.399f, -0.85f)
                lineToRelative(1.0f, -15.0f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -1.424f, -0.972f)
                lineToRelative(-17.0f, 8.0f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, 0.025f, 1.822f)
                close()
                moveTo(8.0f, 22.167f)
                lineToRelative(4.776f, -2.316f)
                lineTo(8.0f, 17.623f)
                close()
            }
        }
        .build()
        return _bxsPaperPlane!!
    }

private var _bxsPaperPlane: ImageVector? = null
