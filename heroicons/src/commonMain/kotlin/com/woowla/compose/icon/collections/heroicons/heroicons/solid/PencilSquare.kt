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

public val SolidGroup.PencilSquare: ImageVector
    get() {
        if (_pencilSquare != null) {
            return _pencilSquare!!
        }
        _pencilSquare = Builder(name = "PencilSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.731f, 2.269f)
                curveTo(20.706f, 1.244f, 19.044f, 1.244f, 18.019f, 2.269f)
                lineTo(16.862f, 3.426f)
                lineTo(20.574f, 7.138f)
                lineTo(21.731f, 5.981f)
                curveTo(22.756f, 4.956f, 22.756f, 3.294f, 21.731f, 2.269f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.513f, 8.199f)
                lineTo(15.801f, 4.487f)
                lineTo(7.4f, 12.887f)
                curveTo(6.783f, 13.504f, 6.33f, 14.265f, 6.081f, 15.101f)
                lineTo(5.281f, 17.786f)
                curveTo(5.203f, 18.05f, 5.275f, 18.336f, 5.47f, 18.53f)
                curveTo(5.664f, 18.725f, 5.95f, 18.797f, 6.214f, 18.719f)
                lineTo(8.899f, 17.919f)
                curveTo(9.735f, 17.67f, 10.496f, 17.217f, 11.113f, 16.6f)
                lineTo(19.513f, 8.199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 5.25f)
                curveTo(3.593f, 5.25f, 2.25f, 6.593f, 2.25f, 8.25f)
                verticalLineTo(18.75f)
                curveTo(2.25f, 20.407f, 3.593f, 21.75f, 5.25f, 21.75f)
                horizontalLineTo(15.75f)
                curveTo(17.407f, 21.75f, 18.75f, 20.407f, 18.75f, 18.75f)
                verticalLineTo(13.5f)
                curveTo(18.75f, 13.086f, 18.414f, 12.75f, 18.0f, 12.75f)
                curveTo(17.586f, 12.75f, 17.25f, 13.086f, 17.25f, 13.5f)
                verticalLineTo(18.75f)
                curveTo(17.25f, 19.578f, 16.578f, 20.25f, 15.75f, 20.25f)
                horizontalLineTo(5.25f)
                curveTo(4.422f, 20.25f, 3.75f, 19.578f, 3.75f, 18.75f)
                verticalLineTo(8.25f)
                curveTo(3.75f, 7.422f, 4.422f, 6.75f, 5.25f, 6.75f)
                horizontalLineTo(10.5f)
                curveTo(10.914f, 6.75f, 11.25f, 6.414f, 11.25f, 6.0f)
                curveTo(11.25f, 5.586f, 10.914f, 5.25f, 10.5f, 5.25f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _pencilSquare!!
    }

private var _pencilSquare: ImageVector? = null
