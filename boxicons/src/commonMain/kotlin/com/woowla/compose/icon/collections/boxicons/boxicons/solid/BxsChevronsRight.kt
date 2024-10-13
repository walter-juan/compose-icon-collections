package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsChevronsRight: ImageVector
    get() {
        if (_bxsChevronsRight != null) {
            return _bxsChevronsRight!!
        }
        _bxsChevronsRight = Builder(name = "BxsChevronsRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.061f, 4.939f)
                lineToRelative(-2.122f, 2.122f)
                lineTo(15.879f, 12.0f)
                lineToRelative(-4.94f, 4.939f)
                lineToRelative(2.122f, 2.122f)
                lineTo(20.121f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.061f, 19.061f)
                lineTo(13.121f, 12.0f)
                lineToRelative(-7.06f, -7.061f)
                lineToRelative(-2.122f, 2.122f)
                lineTo(8.879f, 12.0f)
                lineToRelative(-4.94f, 4.939f)
                close()
            }
        }
        .build()
        return _bxsChevronsRight!!
    }

private var _bxsChevronsRight: ImageVector? = null
