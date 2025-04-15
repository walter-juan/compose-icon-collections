package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Zenbrowser: ImageVector
    get() {
        if (_zenbrowser != null) {
            return _zenbrowser!!
        }
        _zenbrowser = Builder(name = "Zenbrowser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 21.846f)
                curveToRelative(5.438f, 0.0f, 9.846f, -4.408f, 9.846f, -9.846f)
                reflectiveCurveTo(17.438f, 2.154f, 12.0f, 2.154f)
                reflectiveCurveTo(2.154f, 6.562f, 2.154f, 12.0f)
                reflectiveCurveTo(6.562f, 21.846f, 12.0f, 21.846f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(12.0f, 18.462f)
                arcToRelative(6.462f, 6.462f, 0.0f, true, false, 0.0f, -12.924f)
                arcToRelative(6.462f, 6.462f, 0.0f, false, false, 0.0f, 12.924f)
                close()
                moveTo(12.0f, 16.615f)
                arcToRelative(4.615f, 4.615f, 0.0f, true, false, 0.0f, -9.23f)
                arcToRelative(4.615f, 4.615f, 0.0f, false, false, 0.0f, 9.23f)
                close()
                moveTo(15.692f, 12.0f)
                arcToRelative(3.692f, 3.692f, 0.0f, true, true, -7.384f, 0.0f)
                arcToRelative(3.692f, 3.692f, 0.0f, false, true, 7.384f, 0.0f)
                close()
            }
        }
        .build()
        return _zenbrowser!!
    }

private var _zenbrowser: ImageVector? = null
