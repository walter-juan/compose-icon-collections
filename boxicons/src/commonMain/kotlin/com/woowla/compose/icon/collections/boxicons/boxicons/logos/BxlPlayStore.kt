package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlPlayStore: ImageVector
    get() {
        if (_bxlPlayStore != null) {
            return _bxlPlayStore!!
        }
        _bxlPlayStore = Builder(name = "BxlPlayStore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.954f, 11.616f)
                lineToRelative(2.957f, -2.957f)
                lineTo(6.36f, 3.291f)
                curveToRelative(-0.633f, -0.342f, -1.226f, -0.39f, -1.746f, -0.016f)
                lineToRelative(8.34f, 8.341f)
                close()
                moveTo(16.415f, 15.078f)
                lineTo(19.489f, 13.349f)
                curveToRelative(0.6f, -0.336f, 0.929f, -0.812f, 0.929f, -1.34f)
                curveToRelative(0.0f, -0.527f, -0.329f, -1.004f, -0.928f, -1.34f)
                lineToRelative(-2.783f, -1.563f)
                lineToRelative(-3.133f, 3.132f)
                lineToRelative(2.841f, 2.84f)
                close()
                moveTo(4.1f, 4.002f)
                curveToRelative(-0.064f, 0.197f, -0.1f, 0.417f, -0.1f, 0.658f)
                verticalLineToRelative(14.705f)
                curveToRelative(0.0f, 0.381f, 0.084f, 0.709f, 0.236f, 0.97f)
                lineToRelative(8.097f, -8.098f)
                lineTo(4.1f, 4.002f)
                close()
                moveTo(12.954f, 12.857f)
                lineTo(4.902f, 20.91f)
                curveToRelative(0.154f, 0.059f, 0.32f, 0.09f, 0.495f, 0.09f)
                curveToRelative(0.312f, 0.0f, 0.637f, -0.092f, 0.968f, -0.276f)
                lineToRelative(9.255f, -5.197f)
                lineToRelative(-2.666f, -2.67f)
                close()
            }
        }
        .build()
        return _bxlPlayStore!!
    }

private var _bxlPlayStore: ImageVector? = null
