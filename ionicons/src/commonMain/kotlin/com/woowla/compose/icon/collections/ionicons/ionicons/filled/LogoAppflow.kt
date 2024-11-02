package com.woowla.compose.icon.collections.ionicons.ionicons.filled

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
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.LogoAppflow: ImageVector
    get() {
        if (_logoAppflow != null) {
            return _logoAppflow!!
        }
        _logoAppflow = Builder(name = "LogoAppflow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.63f, 28.42f)
                lineTo(8.0f, 484.42f)
                horizontalLineTo(122.38f)
                lineTo(256.0f, 164.78f)
                lineTo(389.62f, 484.42f)
                horizontalLineTo(504.0f)
                lineTo(313.37f, 28.42f)
                horizontalLineTo(198.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 346.04f)
                curveTo(312.0f, 376.97f, 286.93f, 402.04f, 256.0f, 402.04f)
                curveTo(225.07f, 402.04f, 200.0f, 376.97f, 200.0f, 346.04f)
                curveTo(200.0f, 315.11f, 225.07f, 290.04f, 256.0f, 290.04f)
                curveTo(286.93f, 290.04f, 312.0f, 315.11f, 312.0f, 346.04f)
                close()
            }
        }
        .build()
        return _logoAppflow!!
    }

private var _logoAppflow: ImageVector? = null
