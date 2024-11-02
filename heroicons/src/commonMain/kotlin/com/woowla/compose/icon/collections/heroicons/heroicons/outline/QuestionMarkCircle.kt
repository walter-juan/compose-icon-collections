package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.QuestionMarkCircle: ImageVector
    get() {
        if (_questionMarkCircle != null) {
            return _questionMarkCircle!!
        }
        _questionMarkCircle = Builder(name = "QuestionMarkCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.879f, 7.519f)
                curveTo(11.05f, 6.494f, 12.95f, 6.494f, 14.122f, 7.519f)
                curveTo(15.293f, 8.544f, 15.293f, 10.206f, 14.122f, 11.231f)
                curveTo(13.918f, 11.41f, 13.692f, 11.557f, 13.451f, 11.673f)
                curveTo(12.706f, 12.034f, 12.0f, 12.672f, 12.0f, 13.5f)
                verticalLineTo(14.25f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
                moveTo(12.0f, 17.25f)
                horizontalLineTo(12.007f)
                verticalLineTo(17.257f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _questionMarkCircle!!
    }

private var _questionMarkCircle: ImageVector? = null
