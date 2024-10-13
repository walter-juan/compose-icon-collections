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

public val SolidGroup.BxsChevronsDown: ImageVector
    get() {
        if (_bxsChevronsDown != null) {
            return _bxsChevronsDown!!
        }
        _bxsChevronsDown = Builder(name = "BxsChevronsDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.939f, 10.939f)
                lineTo(12.0f, 15.879f)
                lineToRelative(-4.939f, -4.94f)
                lineToRelative(-2.122f, 2.122f)
                lineTo(12.0f, 20.121f)
                lineToRelative(7.061f, -7.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.939f, 3.939f)
                lineTo(12.0f, 8.879f)
                lineToRelative(-4.939f, -4.94f)
                lineToRelative(-2.122f, 2.122f)
                lineTo(12.0f, 13.121f)
                lineToRelative(7.061f, -7.06f)
                close()
            }
        }
        .build()
        return _bxsChevronsDown!!
    }

private var _bxsChevronsDown: ImageVector? = null
