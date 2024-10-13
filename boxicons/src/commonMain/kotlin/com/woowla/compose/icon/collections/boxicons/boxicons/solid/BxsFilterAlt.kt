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

public val SolidGroup.BxsFilterAlt: ImageVector
    get() {
        if (_bxsFilterAlt != null) {
            return _bxsFilterAlt!!
        }
        _bxsFilterAlt = Builder(name = "BxsFilterAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                verticalLineToRelative(-4.586f)
                lineTo(20.414f, 8.0f)
                curveToRelative(0.375f, -0.375f, 0.586f, -0.884f, 0.586f, -1.415f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.585f)
                curveToRelative(0.0f, 0.531f, 0.211f, 1.04f, 0.586f, 1.415f)
                lineTo(11.0f, 15.414f)
                verticalLineTo(22.0f)
                lineToRelative(2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxsFilterAlt!!
    }

private var _bxsFilterAlt: ImageVector? = null
