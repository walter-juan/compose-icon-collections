package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.273f, 5.625f)
                curveTo(3.066f, 4.925f, 4.109f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(18.75f)
                curveTo(19.891f, 4.5f, 20.933f, 4.925f, 21.727f, 5.625f)
                curveTo(21.542f, 4.145f, 20.28f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(5.25f)
                curveTo(3.72f, 3.0f, 2.457f, 4.145f, 2.273f, 5.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.273f, 8.625f)
                curveTo(3.066f, 7.925f, 4.109f, 7.5f, 5.25f, 7.5f)
                horizontalLineTo(18.75f)
                curveTo(19.891f, 7.5f, 20.933f, 7.925f, 21.727f, 8.625f)
                curveTo(21.542f, 7.145f, 20.28f, 6.0f, 18.75f, 6.0f)
                horizontalLineTo(5.25f)
                curveTo(3.72f, 6.0f, 2.457f, 7.145f, 2.273f, 8.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 9.0f)
                curveTo(3.593f, 9.0f, 2.25f, 10.343f, 2.25f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(2.25f, 19.657f, 3.593f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 21.0f, 21.75f, 19.657f, 21.75f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(21.75f, 10.343f, 20.407f, 9.0f, 18.75f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(14.586f, 9.0f, 14.25f, 9.336f, 14.25f, 9.75f)
                curveTo(14.25f, 10.993f, 13.243f, 12.0f, 12.0f, 12.0f)
                curveTo(10.757f, 12.0f, 9.75f, 10.993f, 9.75f, 9.75f)
                curveTo(9.75f, 9.336f, 9.414f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
