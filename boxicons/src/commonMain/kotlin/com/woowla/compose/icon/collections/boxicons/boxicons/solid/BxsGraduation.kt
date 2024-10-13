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

public val SolidGroup.BxsGraduation: ImageVector
    get() {
        if (_bxsGraduation != null) {
            return _bxsGraduation!!
        }
        _bxsGraduation = Builder(name = "BxsGraduation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(11.0f, 4.0f)
                lineToRelative(9.0f, -4.0f)
                verticalLineTo(7.0f)
                lineTo(11.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                verticalLineToRelative(4.267f)
                curveToRelative(0.0f, 1.621f, 4.001f, 3.893f, 9.0f, 3.734f)
                curveToRelative(4.0f, -0.126f, 6.586f, -1.972f, 7.0f, -3.467f)
                curveToRelative(0.024f, -0.089f, 0.037f, -0.178f, 0.037f, -0.268f)
                verticalLineTo(11.0f)
                lineTo(13.0f, 14.0f)
                lineToRelative(-5.0f, -1.667f)
                verticalLineToRelative(3.213f)
                lineToRelative(-1.0f, -0.364f)
                verticalLineTo(12.0f)
                lineToRelative(-3.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bxsGraduation!!
    }

private var _bxsGraduation: ImageVector? = null
