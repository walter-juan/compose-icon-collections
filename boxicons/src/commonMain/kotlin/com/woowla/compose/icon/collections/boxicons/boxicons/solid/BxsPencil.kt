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

public val SolidGroup.BxsPencil: ImageVector
    get() {
        if (_bxsPencil != null) {
            return _bxsPencil!!
        }
        _bxsPencil = Builder(name = "BxsPencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.707f, 19.707f)
                lineTo(18.0f, 10.414f)
                lineTo(13.586f, 6.0f)
                lineToRelative(-9.293f, 9.293f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, -0.263f, 0.464f)
                lineTo(3.0f, 21.0f)
                lineToRelative(5.242f, -1.03f)
                curveToRelative(0.176f, -0.044f, 0.337f, -0.135f, 0.465f, -0.263f)
                close()
                moveTo(21.0f, 7.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.828f)
                lineTo(19.414f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, 0.0f)
                lineTo(15.0f, 4.586f)
                lineTo(19.414f, 9.0f)
                lineTo(21.0f, 7.414f)
                close()
            }
        }
        .build()
        return _bxsPencil!!
    }

private var _bxsPencil: ImageVector? = null
