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

public val Simpleicons.Jhipster: ImageVector
    get() {
        if (_jhipster != null) {
            return _jhipster!!
        }
        _jhipster = Builder(name = "Jhipster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.709f, 7.171f)
                curveToRelative(-2.455f, -0.029f, -6.332f, 1.749f, -8.684f, 2.962f)
                curveToRelative(-3.434f, -1.75f, -10.178f, -4.729f, -10.942f, -1.54f)
                curveToRelative(-1.03f, 4.297f, -2.187f, 7.563f, 0.985f, 8.167f)
                curveToRelative(2.207f, 0.42f, 7.122f, -2.43f, 9.912f, -4.205f)
                curveToRelative(2.78f, 1.771f, 7.746f, 4.66f, 9.96f, 4.231f)
                curveToRelative(3.168f, -0.616f, 2.0f, -3.896f, 0.961f, -8.208f)
                curveToRelative(-0.24f, -1.0f, -1.067f, -1.394f, -2.192f, -1.407f)
                close()
            }
        }
        .build()
        return _jhipster!!
    }

private var _jhipster: ImageVector? = null
