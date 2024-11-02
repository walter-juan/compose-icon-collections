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

public val SolidGroup.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.798f, 11.012f)
                lineTo(17.61f, 14.428f)
                lineTo(9.462f, 6.28f)
                lineTo(13.702f, 1.738f)
                curveTo(13.937f, 1.486f, 14.314f, 1.427f, 14.615f, 1.595f)
                curveTo(14.917f, 1.763f, 15.064f, 2.115f, 14.974f, 2.447f)
                lineTo(12.982f, 9.75f)
                horizontalLineTo(20.25f)
                curveTo(20.549f, 9.75f, 20.819f, 9.927f, 20.938f, 10.201f)
                curveTo(21.057f, 10.475f, 21.002f, 10.793f, 20.798f, 11.012f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.202f, 12.988f)
                lineTo(6.39f, 9.572f)
                lineTo(14.538f, 17.72f)
                lineTo(10.298f, 22.262f)
                curveTo(10.063f, 22.514f, 9.686f, 22.573f, 9.385f, 22.405f)
                curveTo(9.084f, 22.237f, 8.936f, 21.885f, 9.026f, 21.553f)
                lineTo(11.018f, 14.25f)
                horizontalLineTo(3.75f)
                curveTo(3.451f, 14.25f, 3.181f, 14.073f, 3.062f, 13.799f)
                curveTo(2.943f, 13.525f, 2.998f, 13.207f, 3.202f, 12.988f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.53f, 2.47f)
                curveTo(3.237f, 2.177f, 2.763f, 2.177f, 2.47f, 2.47f)
                curveTo(2.177f, 2.763f, 2.177f, 3.237f, 2.47f, 3.53f)
                lineTo(20.47f, 21.53f)
                curveTo(20.763f, 21.823f, 21.237f, 21.823f, 21.53f, 21.53f)
                curveTo(21.823f, 21.237f, 21.823f, 20.763f, 21.53f, 20.47f)
                lineTo(3.53f, 2.47f)
                close()
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null
