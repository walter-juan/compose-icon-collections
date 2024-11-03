package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.InfoCircleFill: ImageVector
    get() {
        if (_infoCircleFill != null) {
            return _infoCircleFill!!
        }
        _infoCircleFill = Builder(name = "InfoCircleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                moveToRelative(0.93f, -9.412f)
                lineToRelative(-1.0f, 4.705f)
                curveToRelative(-0.07f, 0.34f, 0.029f, 0.533f, 0.304f, 0.533f)
                curveToRelative(0.194f, 0.0f, 0.487f, -0.07f, 0.686f, -0.246f)
                lineToRelative(-0.088f, 0.416f)
                curveToRelative(-0.287f, 0.346f, -0.92f, 0.598f, -1.465f, 0.598f)
                curveToRelative(-0.703f, 0.0f, -1.002f, -0.422f, -0.808f, -1.319f)
                lineToRelative(0.738f, -3.468f)
                curveToRelative(0.064f, -0.293f, 0.006f, -0.399f, -0.287f, -0.47f)
                lineToRelative(-0.451f, -0.081f)
                lineToRelative(0.082f, -0.381f)
                lineToRelative(2.29f, -0.287f)
                close()
                moveTo(8.0f, 5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
            }
        }
        .build()
        return _infoCircleFill!!
    }

private var _infoCircleFill: ImageVector? = null
