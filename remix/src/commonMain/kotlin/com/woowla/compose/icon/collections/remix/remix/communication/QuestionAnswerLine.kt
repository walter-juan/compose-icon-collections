package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.QuestionAnswerLine: ImageVector
    get() {
        if (_questionAnswerLine != null) {
            return _questionAnswerLine!!
        }
        _questionAnswerLine = Builder(name = "QuestionAnswerLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.455f, 15.0f)
                lineTo(1.0f, 18.5f)
                verticalLineTo(3.0f)
                curveTo(1.0f, 2.448f, 1.448f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 2.0f, 18.0f, 2.448f, 18.0f, 3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.455f)
                close()
                moveTo(4.763f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.385f)
                lineTo(4.763f, 13.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineTo(18.237f)
                lineTo(20.0f, 18.385f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 8.0f, 22.0f, 8.448f, 22.0f, 9.0f)
                verticalLineTo(22.5f)
                lineTo(17.545f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(8.448f, 19.0f, 8.0f, 18.552f, 8.0f, 18.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _questionAnswerLine!!
    }

private var _questionAnswerLine: ImageVector? = null
