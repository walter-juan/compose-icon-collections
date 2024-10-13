package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxLinkAlt: ImageVector
    get() {
        if (_bxLinkAlt != null) {
            return _bxLinkAlt!!
        }
        _bxLinkAlt = Builder(name = "BxLinkAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.222f, 19.778f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, 3.535f, 1.462f)
                arcToRelative(4.986f, 4.986f, 0.0f, false, false, 3.536f, -1.462f)
                lineToRelative(2.828f, -2.829f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.828f, 2.829f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -4.243f, 0.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, -4.243f)
                lineToRelative(2.829f, -2.828f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.829f, 2.828f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 0.0f, 7.071f)
                close()
                moveTo(19.778f, 11.293f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 0.0f, -7.071f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -7.071f, 0.0f)
                lineTo(9.879f, 7.051f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.828f, -2.829f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, 4.243f, 0.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, 4.243f)
                lineToRelative(-2.829f, 2.828f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.829f, -2.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.464f, 16.95f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(8.487f, -8.486f)
                lineToRelative(1.414f, 1.415f)
                close()
            }
        }
        .build()
        return _bxLinkAlt!!
    }

private var _bxLinkAlt: ImageVector? = null
