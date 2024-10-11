package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.SeedlingFill: ImageVector
    get() {
        if (_seedlingFill != null) {
            return _seedlingFill!!
        }
        _seedlingFill = Builder(name = "SeedlingFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.998f, 7.0f)
                verticalLineTo(9.5f)
                curveTo(21.998f, 13.09f, 19.088f, 16.0f, 15.498f, 16.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(14.0f)
                lineTo(11.017f, 13.001f)
                curveTo(11.272f, 9.644f, 14.076f, 7.0f, 17.498f, 7.0f)
                horizontalLineTo(21.998f)
                close()
                moveTo(5.998f, 3.0f)
                curveTo(9.09f, 3.0f, 11.714f, 5.005f, 12.641f, 7.786f)
                curveTo(11.142f, 9.061f, 10.152f, 10.914f, 10.014f, 13.0f)
                lineTo(8.998f, 13.0f)
                curveTo(5.132f, 13.0f, 1.998f, 9.866f, 1.998f, 6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.998f)
                close()
            }
        }
        .build()
        return _seedlingFill!!
    }

private var _seedlingFill: ImageVector? = null
