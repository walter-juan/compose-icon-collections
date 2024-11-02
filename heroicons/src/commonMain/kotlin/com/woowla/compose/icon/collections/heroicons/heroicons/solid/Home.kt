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

public val SolidGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.47f, 3.841f)
                curveTo(11.763f, 3.548f, 12.237f, 3.548f, 12.53f, 3.841f)
                lineTo(21.22f, 12.53f)
                curveTo(21.513f, 12.823f, 21.987f, 12.823f, 22.28f, 12.53f)
                curveTo(22.573f, 12.237f, 22.573f, 11.763f, 22.28f, 11.47f)
                lineTo(13.591f, 2.78f)
                curveTo(12.712f, 1.902f, 11.288f, 1.902f, 10.409f, 2.78f)
                lineTo(1.72f, 11.47f)
                curveTo(1.427f, 11.763f, 1.427f, 12.237f, 1.72f, 12.53f)
                curveTo(2.013f, 12.823f, 2.487f, 12.823f, 2.78f, 12.53f)
                lineTo(11.47f, 3.841f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.432f)
                lineTo(20.159f, 13.591f)
                curveTo(20.189f, 13.621f, 20.219f, 13.649f, 20.25f, 13.677f)
                verticalLineTo(19.875f)
                curveTo(20.25f, 20.91f, 19.41f, 21.75f, 18.375f, 21.75f)
                horizontalLineTo(15.0f)
                curveTo(14.586f, 21.75f, 14.25f, 21.414f, 14.25f, 21.0f)
                verticalLineTo(16.5f)
                curveTo(14.25f, 16.086f, 13.914f, 15.75f, 13.5f, 15.75f)
                horizontalLineTo(10.5f)
                curveTo(10.086f, 15.75f, 9.75f, 16.086f, 9.75f, 16.5f)
                verticalLineTo(21.0f)
                curveTo(9.75f, 21.414f, 9.414f, 21.75f, 9.0f, 21.75f)
                horizontalLineTo(5.625f)
                curveTo(4.589f, 21.75f, 3.75f, 20.91f, 3.75f, 19.875f)
                verticalLineTo(13.677f)
                curveTo(3.781f, 13.649f, 3.811f, 13.621f, 3.841f, 13.591f)
                lineTo(12.0f, 5.432f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
