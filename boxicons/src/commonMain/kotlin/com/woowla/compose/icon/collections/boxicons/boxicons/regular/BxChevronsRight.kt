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

public val RegularGroup.BxChevronsRight: ImageVector
    get() {
        if (_bxChevronsRight != null) {
            return _bxChevronsRight!!
        }
        _bxChevronsRight = Builder(name = "BxChevronsRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.296f, 7.71f)
                lineTo(14.621f, 12.0f)
                lineToRelative(-4.325f, 4.29f)
                lineToRelative(1.408f, 1.42f)
                lineTo(17.461f, 12.0f)
                lineToRelative(-5.757f, -5.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.704f, 6.29f)
                lineTo(5.296f, 7.71f)
                lineTo(9.621f, 12.0f)
                lineToRelative(-4.325f, 4.29f)
                lineToRelative(1.408f, 1.42f)
                lineTo(12.461f, 12.0f)
                close()
            }
        }
        .build()
        return _bxChevronsRight!!
    }

private var _bxChevronsRight: ImageVector? = null
