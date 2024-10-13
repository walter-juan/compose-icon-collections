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

public val RegularGroup.BxChevronsUp: ImageVector
    get() {
        if (_bxChevronsUp != null) {
            return _bxChevronsUp!!
        }
        _bxChevronsUp = Builder(name = "BxChevronsUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.293f, 11.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 8.414f)
                lineToRelative(4.293f, 4.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 5.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.293f, 16.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 13.414f)
                lineToRelative(4.293f, 4.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 10.586f)
                close()
            }
        }
        .build()
        return _bxChevronsUp!!
    }

private var _bxChevronsUp: ImageVector? = null
