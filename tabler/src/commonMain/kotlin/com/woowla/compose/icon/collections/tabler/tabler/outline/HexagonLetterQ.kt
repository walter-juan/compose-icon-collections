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

public val OutlineGroup.HexagonLetterQ: ImageVector
    get() {
        if (_hexagonLetterQ != null) {
            return _hexagonLetterQ!!
        }
        _hexagonLetterQ = Builder(name = "HexagonLetterQ", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.875f, 6.27f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, 1.125f, 1.948f)
                verticalLineToRelative(7.284f)
                curveToRelative(0.0f, 0.809f, -0.443f, 1.555f, -1.158f, 1.948f)
                lineToRelative(-6.75f, 4.27f)
                arcToRelative(2.269f, 2.269f, 0.0f, false, true, -2.184f, 0.0f)
                lineToRelative(-6.75f, -4.27f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, -1.158f, -1.948f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0.0f, -0.809f, 0.443f, -1.554f, 1.158f, -1.947f)
                lineToRelative(6.75f, -3.98f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 2.25f, 0.0f)
                lineToRelative(6.75f, 3.98f)
                horizontalLineToRelative(-0.033f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                lineToRelative(1.0f, 1.0f)
            }
        }
        .build()
        return _hexagonLetterQ!!
    }

private var _hexagonLetterQ: ImageVector? = null
