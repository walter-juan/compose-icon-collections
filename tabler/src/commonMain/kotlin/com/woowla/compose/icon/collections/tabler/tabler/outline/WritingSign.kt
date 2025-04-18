package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.WritingSign: ImageVector
    get() {
        if (_writingSign != null) {
            return _writingSign!!
        }
        _writingSign = Builder(name = "WritingSign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                curveToRelative(3.333f, -2.0f, 5.0f, -4.0f, 5.0f, -6.0f)
                curveToRelative(0.0f, -3.0f, -1.0f, -3.0f, -2.0f, -3.0f)
                reflectiveCurveToRelative(-2.032f, 1.085f, -2.0f, 3.0f)
                curveToRelative(0.034f, 2.048f, 1.658f, 2.877f, 2.5f, 4.0f)
                curveToRelative(1.5f, 2.0f, 2.5f, 2.5f, 3.5f, 1.0f)
                curveToRelative(0.667f, -1.0f, 1.167f, -1.833f, 1.5f, -2.5f)
                curveToRelative(1.0f, 2.333f, 2.333f, 3.5f, 4.0f, 3.5f)
                horizontalLineToRelative(2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -1.121f, -0.879f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.879f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(4.0f)
            }
        }
        .build()
        return _writingSign!!
    }

private var _writingSign: ImageVector? = null
